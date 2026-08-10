Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                // 1. CGPA decreasing
                if (s1.getCgpa()!= s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }
                // 2. Name ascending
                if (!s1.getFname().equals(s2.getFname())) {
                    return s1.getFname().compareTo(s2.getFname());
                }
                // 3. ID ascending
                return s1.getId() - s2.getId();
            }
        });