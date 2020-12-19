package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.verification.VerificationMode;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
//@RunWith(MockitoJUnitRunner.class)
//@RunWith(JUnitPlatform.class)
@RunWith(SpringRunner.class)
@WebMvcTest(value=EmployeeController.class)
public class EmployeeControllerTest<Repo, EmployeeVO> {

    private MockMvc mockMvc;
    //Mock creates a mock implementation of the class
    //InjectMocks creates mock implementation and injects the dependent mocks marked with Mock annotatiion


    @InjectMocks //creates objects and injects mocked dependencies
    EmployeeController controller;

    @Mock //creates mock
    EmployeeRepository repo;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindAll() {
        List<EmployeeVO> list = new ArrayList<EmployeeVO>();
        EmployeeVO employee1 = (EmployeeVO) new Employee(100, "Alex", 1, "IT", "alex@gmail.com");
        EmployeeVO employee2 = (EmployeeVO) new Employee(200, "Beth", 2, "Marketing", "Beth@gmail.com");
        Employee employees = new Employee();
        list.add(employee1);
        list.add(employee2);

//        employees.setEmployeesList()
//        employees.setEmployeeList(Arrays.asList(employee1,employee2));
        when(repo.findAll()).thenReturn((List<Employee>) list);

        //when
        List<Employee> empList = controller.retrieveAllEmployees();
        assertEquals(2, empList.size());

//        assertNull(employee1,empList.size());
        verify(repo, times(1));


    }

    private void assertNull(EmployeeVO employee1, int size) {
    }

    private void verify(EmployeeRepository repo, VerificationMode times) {

    }

    @Test
    public void createEmployeeTest()
    {
        Employee emp = new Employee(100, "Alex", 1, "IT", "alex@gmail.com");

        controller.addEmployee(emp);

        verify(repo, times(1));
    }



//
//    @Test
//    public void TestFindAll2() {
//        Employee employee1 = new Employee(100, "Alex", 1, "IT", "alex@gmail.com");
//        Employee employee2 = new Employee(200, "Beth", 2, "Marketing", "Beth@gmail.com");
//        Employee employee3 = new Employee(300, "Lewis", 3, "Finance", "lewis@gmail.com");
//        Employee employee4 = new Employee(400, "Mathews", 3, "Finance", "Mathews@gmail.com");
//        Employee employee5 = new Employee(500, "Aden", 1, "IT", "Alen@gmail.com");
//        Employees employees = new Employees();
//        employees.setEmployeeList(Arrays.asList(employee1, employee2,employee3,employee4,employee5));
//        when(repo.findAll()).thenReturn((List<Employee>) employees);
//
//        //when
//        Employees result = (Employees) controller.retrieveAllEmployees();
//
//        //then
//        assertThat(result.getEmployeeList().size()).isEqualTo(5);
//        assertThat(result.getEmployeeList().get(0).getEmpName()).isEqualTo(employee1.getEmpName());
//        assertThat(result.getEmployeeList().get(1).getEmpName()).isEqualTo(employee2.getEmpName());
//    }




//    public void testAddEmployee() {
//        MockHttpServletRequest request = new MockHttpServletRequest();
//        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
//
//
//        when(repo.addEmployee(any(Employee.class))).thenReturn(true);
//        Employee employee = new Employee(100, "Alex", 1, "IT", "alex@gmail.com");
////                Employee responseEntity= controller.addEmployee(employee);
////        Employee responseEntity= controller.addEmployee(employee);
//        Employee responseEntity = controller.addEmployee(employee);
////
//
//        UrlCssBuilder serverRunning = null;
//        ResponseEntity<String> response = new RestTemplate().postForEntity(serverRunning.getUrl(), request, String.class);
//        assertEquals(201, response.getStatusCodeValue());
////        assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo("/1");
//
//
//    }
//
//    private Object any(Class<Employee> employeeClass) {
//        return employeeClass;
//    }

}
