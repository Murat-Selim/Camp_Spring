package kodlamaio.rentACar.business.abstracts;

import java.util.List;

import kodlamaio.rentACar.business.requests.CreateBrandRequest;
import kodlamaio.rentACar.business.requests.UpdateBrandRequest;
import kodlamaio.rentACar.business.responses.GetAllBrandsResponse;
import kodlamaio.rentACar.business.responses.GetByIdBrandResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);

}
