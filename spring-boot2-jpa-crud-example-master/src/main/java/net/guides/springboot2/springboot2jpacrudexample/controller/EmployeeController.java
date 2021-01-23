package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
//	@Autowired
//	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public List<Object> getAllEmployees() {
		return Arrays.asList("aaa", "bbb");
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Object> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Object employee = new Object();
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/employees")
	public Object createEmployee(@Valid @RequestBody Object employee) {
		return new Object();
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Object> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@Valid @RequestBody Object employeeDetails) throws ResourceNotFoundException {
//		Employee employee = employeeRepository.findById(employeeId)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

//		employee.setEmailId(employeeDetails.getEmailId());
//		employee.setLastName(employeeDetails.getLastName());
//		employee.setFirstName(employeeDetails.getFirstName());
		final Object updatedEmployee = new Object();
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Object employee = new Object();

//		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
