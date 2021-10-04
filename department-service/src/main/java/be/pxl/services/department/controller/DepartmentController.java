package be.pxl.services.department.controller;

import java.util.List;

import be.pxl.services.department.model.Department;
import be.pxl.services.department.repository.DepartmentRepository;


import be.pxl.services.department.client.EmployeeClient;

//@RestController
public class DepartmentController {

//	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
//
//	@Autowired
//    DepartmentRepository repository;
//	@Autowired
//	EmployeeClient employeeClient;
//
//	@PostMapping("/")
//	public Department add(@RequestBody Department department) {
//		LOGGER.info("Department add: {}", department);
//		return repository.add(department);
//	}
//
//	@GetMapping("/{id}")
//	public Department findById(@PathVariable("id") Long id) {
//		LOGGER.info("Department find: id={}", id);
//		return repository.findById(id);
//	}
//
//	@GetMapping("/")
//	public List<Department> findAll() {
//		LOGGER.info("Department find");
//		return repository.findAll();
//	}
//
//	@GetMapping("/organization/{organizationId}")
//	public List<Department> findByOrganization(@PathVariable("organizationId") Long organizationId) {
//		LOGGER.info("Department find: organizationId={}", organizationId);
//		return repository.findByOrganization(organizationId);
//	}
//
//	@GetMapping("/organization/{organizationId}/with-employees")
//	public List<Department> findByOrganizationWithEmployees(@PathVariable("organizationId") Long organizationId) {
//		LOGGER.info("Department find: organizationId={}", organizationId);
//		List<Department> departments = repository.findByOrganization(organizationId);
//		departments.forEach(d -> d.setEmployees(employeeClient.findByDepartment(d.getId())));
//		return departments;
//	}
//
}
