package com.ziafat_majeed.pizzawissa.retrofits;

import com.ziafat_majeed.pizzawissa.data.Products;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

@GET("loadproducts.php")
    Call<List<Products>> loadProducts();
}
