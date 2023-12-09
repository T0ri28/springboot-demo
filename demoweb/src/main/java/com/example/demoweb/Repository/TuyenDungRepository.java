package com.example.demoweb.Repository;

import com.example.demoweb.model.Post;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TuyenDungRepository extends MongoRepository<Post, String> {
    //@Query("{tenCongViec  : { $regex : ?0 }}")
    @Query("{$or:[{tenCongViec: {$regex: ?0, $options: 'i'}}, {kinhNghiem: {$regex : ?0, $options: 'i'}}, {kyNang: {$regex : ?0, $options: 'i'}}]}")
    List<Post> findbytenCongViec(String tenCongViec, String kinhNghiem, String kyNang);
}
