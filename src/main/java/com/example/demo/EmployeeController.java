package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@RestController //Handles HTTP Request,data returned by each method will be written straight into the response body
public class EmployeeController {
    //initializes the logger object
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    //EmployeeRepository is injected by constructor into the controller
    private EmployeeRepository repo;


    //---------------getAllEmployees----------------------
    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployees() {
        logger.info("List of all employees");
        return repo.findAll();
    }

    //----------------Posting employee object---------
    @RequestMapping(method=RequestMethod.POST,value="/employee")
    @ExceptionHandler(Exception.class)
    @PostMapping("/employee")
    public Employee addEmployee(@Valid @RequestBody Employee employee) {
        //@valid instantiates a validator to validate an object
        return repo.save(employee);
//        return employee;
    }


    //------------------Delete employee object----------------
    @DeleteMapping(value = "/employee", params = "empId")
    public String deleteEmployee(@RequestParam int empId) {
        Employee e = repo.getOne(empId);
        repo.delete(e);//null check
        return "deleted";
    }

    //---------------------Put Mapping----------------------
    @PutMapping(path = "/employee")
    public  Employee saveOrUpdateEmployee(@Valid @RequestBody Employee employee) {
        repo.save(employee);
        return employee;
    }


//----------------getEmployee by Id-------------------------
    //@RequestMapping("/employee/empId")
    //public Employee getEmployeeById(@PathVariable int empId)
    @RequestMapping(value = "/employee", params = "empId")
    public Employee getEmployeeByEmpId(@NotNull int empId) {
//        getEmployeeListByDeptId(empId);
    if (!repo.findById(empId).isPresent()) logger.info("Employee with empId: " + empId + "  not found!");
        return repo.findById(empId)
                .orElseThrow(() -> new EmployeeNotFoundException(empId));
    }



    //------------getEmployeeList by deptId---------------------
    @RequestMapping(value="/employee", params="deptId")
    public List<Employee> getEmployeeListByDeptId(@RequestParam int deptId)
    {
        Optional<Employee> empDeptWiseList=repo.findById(deptId);
        logger.info("Dept wise List:"+empDeptWiseList);
        List<Employee> employeeList = repo.findAll();

        List<Employee> employee=employeeList.stream()
                .filter(e-> e.getDeptId()==(deptId))
                .collect(Collectors.toList());
//                .orElseThrow(() -> new IllegalArgumentException("Employee not found " + deptId));

        if (employee.isEmpty())
//            throw new IllegalArgumentException("employee with deptId: "+deptId+" not found!");
            logger.info("Employee with deptId: "+deptId+" not found!");
        return employee;
//                .orElseThrow(() -> new EmployeeNotFoundException(deptId));
    }

//    @PostMapping("/employees")
//    ResponseEntity<?> newEmployee(@RequestBody Employee newEmployee) throws URISyntaxException {
//
//        EntityModel<Employee> entityModel = assembler.toModel(repository.save(newEmployee));
//
//        return ResponseEntity
//                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
//                .body(entityModel);
//    }
}

