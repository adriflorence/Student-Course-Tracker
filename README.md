# Student Course Tracker

This is simple Course tracking system that allows storing, editing and deleting Students, Courses, Instructors and Lessons for various Qualifications with the use of Hibernate.

## MVP

- The `Student` class should have `First Name`, `Last Name`, `Age` and a `enrolment_number`.
- The `Course` class should have a `title`, an Enum for `level` (BENG, BSC, BA, etc), and a `List<Student> students` 
- Many `Student`s can attend a `Course`
- Write the CRUD functions in a `DBHelper` class. (`save`, `update`, `delete`, `getAll` and `find`)
- Write a method in a `DBCourse` class to return a list of all students on the course.


## Extension

- Add a collection of lessons to the course. `Lessons` will have `title`, `classroom_number` and a `date`
- Write a method to return all course lessons.
- Add an `Instructor` class and give instructor a `name` and collection of `lessons`.
- Write a method to return all lessons for an instructor.
- Add mapping classes to hibernate.cfg.xml
