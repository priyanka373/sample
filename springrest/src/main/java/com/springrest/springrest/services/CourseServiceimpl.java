package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Course;
@Service
public class CourseServiceimpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	// List<Course> list;
	public CourseServiceimpl() {
		//list=new ArrayList<>();
		//list.add(new Course(145,"Java Core Course","this course contains core java"));
		//list.add(new Course(4343,"Spring boot Course","this course contains core spring boot"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		// Course c=null;
		// for(Course course:list) {
			// if(course.getId()==courseId) {
				// c=course;
				// break;
			//}
		//}
		return courseDao.getReferenceById(courseId);
	}

	@Override
	public Course addCourse (Course course) {
		// list.add(course);
		courseDao.save(course); 
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		//list.forEach(e-> {
		//if(e.getId()==course.getId()) {
			//e.setTitle(course.getTitle());
			//e.setDescription(course.getDescription());
		//}
		
		//});
		courseDao.save(course);
		return course;  
	}

	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		//for(Course course:list) {
			//if(course.getId()==courseId) {
				//list.remove(course);
				//break;
			//}
		//}
	Course entity=courseDao.getReferenceById(courseId);
	courseDao.delete(entity);
	}

}
