//package com.example.demo;//package com.example.demo;
////
////
//import com.example.demo.Employee;
//import com.example.demo.EmployeeRepository;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.stubbing.OngoingStubbing;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.lang.reflect.Array;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class EmployeeRepositoryTest {
//
//    @MockBean
//    EmployeeRepository employeerepository;
//
//    ObjectMapper mapper= new ObjectMapper();
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @Test
//    public <CreateEmployeeReqiuest> void testRepository() //should return created employee
//    {
//        CreateEmployeeReqiuest createEmployeeRequest = new CreateEmployeeRequest();
//        createEmployeeRequest.setName("test employee");
//
//        when (employeerepository.save(any(Employee.class))).thenReturn(new Employee());
//        Employee created= emplo
//        }
//
//    private OngoingStubbing<Employee> when(Employee save) {
//    }
//
//    private <S extends T> S any(Class<Employee> employeeClass) {
//    }
////        Employee emp=new Employee();
////        emp.setEmpId(100);
////        emp.setEmpName("Alex");
////        emp.setDeptId(1);
////        emp.setDeptName("IT");
////        emp.setEmpEmail("alex@gmail.com");
////
////        repository.save(emp);
////        Assert.assertNotNull(emp.getDeptId());
//    }
//}
