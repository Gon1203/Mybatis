package com.myapp.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.myapp.mybatis.model.User;

@Mapper // jpa repository 역할을 함
public interface UserMapper {

	@Select("select * from user where id = #{id}") // String id == #{id} 결과가 User 객체로 리턴됨
	User getUser(String id); // 유저 객체 리턴 id로 DB에서 조회
	
	@Select("select * from user")
	List<User> getUserList();
	
	@Insert("insert into user value (#{id}, #{name}, #{phone}, #{address})")
	int insertUser(String id, String name, String phone, String address);
	
	@Update("update user set name=#{name}, phone=#{phone}, address=#{address} where id = #{id}")
	int updateUser(String id, String name, String phone, String address);

	@Delete("delete from user where id = #{id}")
	int deleteUser(String id);
}
