package com.bizTrack.BizTrack.Controller;

import com.bizTrack.BizTrack.Model.Course;
import com.bizTrack.BizTrack.Model.Customer;
import com.bizTrack.BizTrack.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bixTrack")
public class BizTrack {

    @Autowired
    private CustomerService customerService;
        @PostMapping("/addCustomers")
        public ResponseEntity<Customer> saveCustomer(@Validated @RequestBody Customer customer) {
            Customer savedCustomer = customerService.saveCustomer(customer);
            return ResponseEntity.ok(savedCustomer);
        }

        @GetMapping("/getCustomers")
        public ResponseEntity<List<Customer>> getCustomers() {
            List<Customer> customers = customerService.getCustomers();
            return ResponseEntity.ok(customers);
        }

        @PutMapping("/updateCustomers/{id}")
        public ResponseEntity<Customer> updateCustomer(@Validated @RequestBody Customer customer, @PathVariable("id") Long customerId) {
            Customer updatedCustomer = customerService.updateCustomer(customer, customerId);
            return ResponseEntity.ok(updatedCustomer);
        }

        @PostMapping("/addCourse")
        public ResponseEntity<Course> saveCourse(@Validated @RequestBody Course course) {
            Course savedCourse = customerService.saveCourse(course);
            return ResponseEntity.ok(savedCourse);

        }

        @GetMapping("/getCourses")
        public ResponseEntity<List<Course>> getCourses() {
            List<Course> courses = customerService.getCourses();
            return ResponseEntity.ok(courses);
        }

        @PutMapping("/updateCourse/{id}")
        public ResponseEntity<Course> updateCourse(@Validated @RequestBody Course course, @PathVariable("id") Long courseId) {
            Course updatedCourse = customerService.updateCourse(course, courseId);
            return ResponseEntity.ok(updatedCourse);
        }

}
