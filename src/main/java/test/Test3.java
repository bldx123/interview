package test;

import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test3 {

    @Test
    public void main(){
        Clazz clazzA = new Clazz("A");
        Clazz clazzB = new Clazz("B");
        Set<People> set = new HashSet<>();
        for(int i=0;i<100;i++){
           switch (new Random().nextInt(4)){
               case 0:set.add(new Student("student"+i,clazzA));break;
               case 1:set.add(new Student("student"+i,clazzB));break;
               case 2:set.add(new Teacher("teacher"+i,clazzA));break;
               case 3:set.add(new Teacher("teacher"+i,clazzB));break;
           }
        }
        Set<Student> students = getStudents(set,clazzA);
        students.forEach(System.out::println);
    }

    /**
     * 从set中筛选出班级为clazz的学生
     * @param set
     * @param clazz
     * @return
     */
    public Set<Student> getStudents(Set<People> set,Clazz clazz){
        return new HashSet<>();
    }

    interface People{
        Clazz getClazz();
    }

    class Clazz{
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Clazz(String name) {
            this.name = name;
        }
    }

    class Teacher implements People{

        private String name;

        private Clazz clazz;

        @Override
        public Clazz getClazz() {
            return clazz;
        }

        public void setClazz(Clazz clazz) {
            this.clazz = clazz;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Teacher(Clazz clazz) {
            this.clazz = clazz;
        }

        public Teacher(String name, Clazz clazz) {
            this.name = name;
            this.clazz = clazz;
        }
    }

    class Student implements People{

        private String name;

        private Clazz clazz;

        @Override
        public Clazz getClazz() {
            return clazz;
        }

        public void setClazz(Clazz clazz) {
            this.clazz = clazz;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(String name, Clazz clazz) {
            this.name = name;
            this.clazz = clazz;
        }

        @Override
        public String toString() {
            return name + ":" + clazz.getName();
        }
    }


}
