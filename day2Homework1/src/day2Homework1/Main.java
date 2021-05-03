package day2Homework1;

public class Main {

		public static void main(String[] args) {
			
			Category category1 = new Category(1,"Programlama");
			
			Category[] categories= {category1};
			
			Course course1 = new Course(1,"Programlamaya Giriş için Temel Kurs");
			Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)");
			Course course3 = new Course(3,"Yazılım Geliştirici Yetiştirme Kampı (Java + React)");

			
			Course[] course= {course1,course2,course3};

			
			Teacher teacher1 =new Teacher(1, "Engin","Demiroğ");
			Teacher teacher2 =new Teacher(2, "M.Can","Çankaya");
			
			Teacher[] teachers= {teacher1,teacher2};
			
			
			
			System.out.println("Kategoriler;");
				for(Category category:categories) {
					System.out.println(">"+category.name);
				}
			
			System.out.println("---------------------------------");
			System.out.println("Kurslar;");
			
				for (Course courses : course) {
					System.out.println("> "+courses.name);
				}
			
			System.out.println("---------------------------------");
			
			System.out.println("Eğitmenler;");
				
				for (Teacher teacher : teachers) {
					System.out.println(">"+teacher.firstName+" "+teacher.lastName);
				}

			System.out.println("---------------------------------");			
			
			System.out.println("LOGLAR");
		
			CourseManager courseManager = new CourseManager();
			courseManager.addCourse(course1);
			courseManager.addCourse(course2);
			courseManager.addCourse(course3);
			System.out.println("---------------------------------");
			courseManager.deleteCourse(course1);
			courseManager.deleteCourse(course2);
			courseManager.deleteCourse(course3);
			
			System.out.println("---------------------------------");
			
			TeacherManager teacherManager= new TeacherManager();
			teacherManager.addTeacher(teacher1);
			teacherManager.addTeacher(teacher2);
			System.out.println("---------------------------");
			teacherManager.deleteTeacher(teacher1);
			teacherManager.deleteTeacher(teacher2);
			System.out.println("---------------------------------");
			
			CategoryManager categoryManager=new CategoryManager();
			categoryManager.addCategory(category1);
			System.out.println("---------------------------------");
			categoryManager.deleteCategory(category1);
			

	}

}
