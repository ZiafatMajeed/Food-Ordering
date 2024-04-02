package com.ziafat_majeed.pizzawissa.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;


import com.ziafat_majeed.pizzawissa.data.Products;

import java.util.List;

@Dao
public interface ProductDao {
    @Query("SELECT * FROM Products")
    List<Products> getAll();
    @Query("SELECT * FROM Products limit 500")
    LiveData<List<Products>> liveGetAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertOrReplace(Products Product);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertOrReplaceAll(List<Products> Products);

    @Delete
    void delete(Products blogPost);

    @Update
    void update(Products blogPost);

    @Query("DELETE FROM Products")
    void deleteAll();

}