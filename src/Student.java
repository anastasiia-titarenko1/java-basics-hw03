public class Student {
  int rating;
  private String name;
  public static int count = 0;
  public static int sumOfRating = 0;

  // TODO implement Student class according to the instructions provided in the README.md file

  public Student(String name) {
    //TODO initialize name
    this.name = name;
    count++;
  }

  private Student() {
    count++;
  }

  private Student(String name, int rating) {
    this.name = name;
    this.rating = rating;
    count++;
  }

  public static double getAvgRating() {
    // TODO return average rating of all students
    double avg = 0.0;
    if (count > 0) {
      avg = (double) sumOfRating / count;
    }
    return avg;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    // TODO set student's name
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    // TODO initialize rating;
    this.rating = rating;
    sumOfRating += rating;
  }

  public boolean betterStudent(Student student) {
    // TODO return the result of comparing this.student's rating with the student's rating
    return this.rating > student.rating;
  }

  public void changeRating(int rating) {
    // TODO change this student's rating and average rating of all students
    sumOfRating -= this.rating;
    this.rating = rating;
    sumOfRating += rating;
  }

  public static void removeStudent(Student student) {
    // TODO remove student
    sumOfRating = sumOfRating - student.rating;
    count--;
  }

  @Override
  public String toString() {
    // TODO return String with name and rating of this student
    return this.name + " " + this.rating;
  }
}
