package kodlamaio.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import kodlamaio.northwind.core.utilities.results.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	

	@GetMapping("/getall")
	public DataResult<List<Product>>getAll(){
		return this.productService.getAll();
	
		
	}
	
	@GetMapping("/getProductWithCategoryDetails")
	public DataResult<List<ProductWithCategoryDto>>getProductWithCategoryDetails(){
		return this.productService.getProductWithCategoryDetails();
	
		
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product>
	getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId")int categoryId){
		System.out.println(productName);
		System.out.println(categoryId);
		
		
		
	return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	



}	
	@GetMapping("/getByProductNameContains")
	DataResult<List<Product>>  getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}  
	
	
	@GetMapping("/getAllByPage")
	DataResult<List<Product>> getAll(int pageNo , int pageSize){
		return this.productService.getAll(pageNo-1, pageSize);
		
	}
	
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Product>> getAllSorted() {
		return this.productService.getAllSorted();
	}
}