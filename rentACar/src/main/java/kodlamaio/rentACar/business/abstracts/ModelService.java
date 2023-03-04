package kodlamaio.rentACar.business.abstracts;

import java.util.List;

import kodlamaio.rentACar.business.requests.CreateModelRequest;
import kodlamaio.rentACar.business.responses.GetAllModelsResponse;

public interface ModelService {
	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest);

}
