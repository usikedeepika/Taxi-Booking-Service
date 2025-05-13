package com.example.demo.Transformer;

import com.example.demo.Model.Cab;
import com.example.demo.Model.Driver;
import com.example.demo.dto.request.CabRequest;
import com.example.demo.dto.response.CabResponse;

public class CabTransformor {

    public  static CabResponse CabToCabResponse(Cab cab, Driver driver){

        CabResponse cabResponse=new CabResponse();

        cabResponse.setCabNumber(cab.getCabNumber());
        cabResponse.setCabModel(cab.getCabModel());
        cabResponse.setDriverResponse(DriverTransformer.DrivertoDriverResponse(driver));
        cabResponse.setPerKmRate(cab.getPerKmRate());

        cabResponse.setAvailable(cab.getAvailable());

        return cabResponse;
    }

    public static Cab CabRequestToCab(CabRequest cabRequest){

      Cab cab=new Cab();
        cab.setCabModel(cabRequest.getCabModel());
       cab.setCabNumber(cabRequest.getCabNumber());
       cab.setPerKmRate(cabRequest.getPerKmRate());
       cab.setAvailable(true);
       return cab;
    }
}
