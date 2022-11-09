package kodlamaio.rentACar.business.abstracts;

import java.util.List;

import kodlamaio.rentACar.business.requests.CreateBrandRequest;
import kodlamaio.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);

}
