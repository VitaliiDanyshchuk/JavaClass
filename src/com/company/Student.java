/**
* @author Danyschuk Vitalii CHNU
* @version 1.0
* Classname Student*
*
* Module 2 Task 4. Programming patterns. Factory, Builder.
Task description:
3. Create a class Student.
4. Create a builder for the class Student
*/
    package com.company;
    import java.time.LocalDate;
    public class Student {
        private String firstName;           // firstName student's first name
        private String lastName;            // lastName student's last name
        private int phoneNumber;            // student's phone number
        private LocalDate birthday;         // student's birthday
        private Gender gender;              // student's gender
        private String faculty;             // on what faculty student is studying
        private String speciality;      // on what speciality student is studying
        private String groupNumber;         // on what group student is studying
        private int creditsNumber;          // unit of measurement of student workload
        private String pasportSeries;       // student's pasport series
        private int identificationNumber;   // student's identification number
        private boolean liveInChummery;     // is student live in chummery
        private int course;                 // number of course
        private String sportSection;        // student's sport section
        private Float averageMark;          // average mark of student
        private String citizenship;         // student's citizenship
        private boolean isContract;         // paid or free study
        private String emailAddress;        // student`s email
        private boolean socialBenefit;      // is student have social benefit
        private int postIndex;              // student's post index
        private boolean isFullTimeEducation;// is student studying full-time or part-time
        private boolean isEmployee;         // is student employee
        private String motherPhone;         // number of mather phone
        private String fatherPhone;         // number of father phone
        private boolean isScientificWorks;  // is student have scientific works

        public Student() {
        }

        public Student(String firstName,
                       String lastName,
                       int phoneNumber,
                       LocalDate birthday,
                       String speciality,
                       Gender gender,
                       String faculty,
                       String groupNumber,
                       String pasportSeries,
                       int identificationNumber,
                       boolean liveInChummery,
                       int course,
                       String emailAddress,
                       String sportSection,
                       Float averageMark,
                       String citizenship,
                       boolean isContract,
                       boolean socialBenefit,
                       int postIndex,
                       boolean isFullTimeEducation,
                       boolean isEmployee,
                       String motherPhone,
                       String fatherPhone,
                       boolean isScientificWorks) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.birthday = birthday;
            this.speciality = speciality;
            this.gender = gender;
            this.faculty = faculty;
            this.groupNumber = groupNumber;
            this.creditsNumber = creditsNumber;
            this.pasportSeries = pasportSeries;
            this.liveInChummery = liveInChummery;
            this.identificationNumber = identificationNumber;
            this.course = course;
            this.sportSection = sportSection;
            this.averageMark = averageMark;
            this.citizenship = citizenship;
            this.isContract = isContract;
            this.emailAddress = emailAddress;
            this.socialBenefit = socialBenefit;
            this.postIndex = postIndex;
            this.isFullTimeEducation = isFullTimeEducation;
            this.isEmployee = isEmployee;
            this.motherPhone = motherPhone;
            this.fatherPhone = fatherPhone;
            this.isScientificWorks = isScientificWorks;
        }

        // getters and setters
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public LocalDate getBirthday() {
            return birthday;
        }

        public void setBirthday(LocalDate birthday) {
            this.birthday = birthday;
        }

        public String getSpeciality() {
            return speciality;
        }

        public void setSpeciality(String speciality) {
            this.speciality = speciality;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public String getGroupNumber() {
            return groupNumber;
        }

        public void setGroupNumber(String groupNumber) {
            this.groupNumber = groupNumber;
        }

        public int getCreditsNumber() {
            return creditsNumber;
        }

        public void setCreditsNumber(int creditsNumber) {
            this.creditsNumber = creditsNumber;
        }

        public String getPasportSeries() {
            return pasportSeries;
        }

        public void setPasportSeries(String pasportSeries) {
            this.pasportSeries = pasportSeries;
        }

        public boolean getliveInChummery() {
            return liveInChummery;
        }

        public void setliveInChummery(boolean liveInChummery) {
            this.liveInChummery = liveInChummery;
        }

        public int getIdentificationNumber() {
            return identificationNumber;
        }

        public void setIdentificationNumber(int identificationNumber) {
            this.identificationNumber = identificationNumber;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public String getSportSection() {
            return sportSection;
        }

        public void setSportSection(String sportSection) {
            this.sportSection = sportSection;
        }

        public Float getAverageMark() {
            return averageMark;
        }

        public void setAverageMark(Float averageMark) {
            this.averageMark = averageMark;
        }

        public String getCitizenship() {
            return citizenship;
        }

        public void setCitizenship(String citizenship) {
            this.citizenship = citizenship;
        }

        public boolean isContract() {
            return isContract;
        }

        public void setContract(boolean contractor) {
            this.isContract = contractor;
        }

        public String emailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public boolean isHasSocialBenefit() {
            return socialBenefit;
        }

        public void setHasSocialBenefit(boolean socialBenefit) {
            this.socialBenefit = socialBenefit;
        }

        public int getPostIndex() {
            return postIndex;
        }

        public void setPostIndex(int postIndex) {
            this.postIndex = postIndex;
        }

        public boolean isFullTimeEducation() {
            return isFullTimeEducation;
        }

        public void setFullTimeEducation(boolean fullTimeEducation) {
            this.isFullTimeEducation = fullTimeEducation;
        }

        public boolean isEmployee() {
            return isEmployee;
        }

        public void setIsEmployee(boolean isEmployee) {
            this.isEmployee = isEmployee;
        }

        public String getMotherPhone() {
            return motherPhone;
        }

        public void setMotherPhone(String motherPhone) {
            this.motherPhone = motherPhone;
        }

        public String getFatherPhone() {
            return fatherPhone;
        }

        public void setFatherPhone(String fatherPhone) {
            this.fatherPhone = fatherPhone;
        }

        public boolean getIsScientificWorks() {
            return isScientificWorks;
        }

        public void setIsScientificWorks(boolean isScientificWorks) {
            this.isScientificWorks = isScientificWorks;
        }

        //pattern 'Builder' for class Student
        public static class Builder {
            private Student studentToBuild;

            public Builder() {
                this.studentToBuild = new Student();
            }

            public Builder setSimilarTo(Student student) {
                this.studentToBuild.firstName = student.firstName;
                this.studentToBuild.lastName = student.lastName;
                this.studentToBuild.phoneNumber = student.phoneNumber;
                this.studentToBuild.birthday = student.birthday;
                this.studentToBuild.speciality = student.speciality;
                this.studentToBuild.gender = student.gender;
                this.studentToBuild.faculty = student.faculty;
                this.studentToBuild.groupNumber = student.groupNumber;
                this.studentToBuild.creditsNumber = student.creditsNumber;
                this.studentToBuild.pasportSeries = student.pasportSeries;
                this.studentToBuild.liveInChummery = student.liveInChummery;
                this.studentToBuild.identificationNumber = student.identificationNumber;
                this.studentToBuild.course = student.course;
                this.studentToBuild.sportSection = student.sportSection;
                this.studentToBuild.averageMark = student.averageMark;
                this.studentToBuild.citizenship = student.citizenship;
                this.studentToBuild.isContract = student.isContract;
                this.studentToBuild.emailAddress = student.emailAddress;
                this.studentToBuild.socialBenefit = student.socialBenefit;
                this.studentToBuild.postIndex = student.postIndex;
                this.studentToBuild.isFullTimeEducation = student.isFullTimeEducation;
                this.studentToBuild.isEmployee = student.isEmployee;
                this.studentToBuild.motherPhone = student.motherPhone;
                this.studentToBuild.fatherPhone = student.fatherPhone;
                this.studentToBuild.isScientificWorks = student.isScientificWorks;

                return this;
            }

            public Builder setFirstName(String firstName) {
                studentToBuild.setFirstName(firstName);
                return this;
            }

            public Builder setLastName(String lastName) {
                studentToBuild.setLastName(lastName);
                return this;
            }

            public Builder setPhoneNumber(int phoneNumber) {
                studentToBuild.setPhoneNumber(phoneNumber);
                return this;
            }

            public Builder setBirthday(LocalDate birthday) {
                studentToBuild.setBirthday(birthday);
                return this;
            }

            public Builder setSpeciality(String speciality) {
                studentToBuild.setSpeciality(speciality);
                return this;
            }

            public Builder setGender(Gender gender) {
                studentToBuild.setGender(gender);
                return this;
            }

            public Builder setFaculty(String faculty) {
                studentToBuild.setFaculty(faculty);
                return this;
            }

            public Builder setGroupNumber(String groupNumber) {
                studentToBuild.setGroupNumber(groupNumber);
                return this;
            }

            public Builder setCreditsNumber(int creditsNumber) {
                studentToBuild.setCreditsNumber(creditsNumber);
                return this;
            }

            public Builder setPasportSeries(String pasportSeries) {
                studentToBuild.setPasportSeries(pasportSeries);
                return this;
            }

            public Builder setLiveInChummery(boolean liveInChummery) {
                studentToBuild.setliveInChummery(liveInChummery);
                return this;
            }

            public Builder setIdentificationNumber(int identificationNumber) {
                studentToBuild.setIdentificationNumber(identificationNumber);
                return this;
            }

            public Builder setCourse(int course) {
                studentToBuild.setCourse(course);
                return this;
            }

            public Builder setSportSection(String sportSection) {
                studentToBuild.setSportSection(sportSection);
                return this;
            }

            public Builder setAverageMark(Float averageMark) {
                studentToBuild.setAverageMark(averageMark);
                return this;
            }

            public Builder setCitizenship(String citizenship) {
                studentToBuild.setCitizenship(citizenship);
                return this;
            }

            public Builder setContractor(boolean contractor) {
                studentToBuild.setContract(contractor);
                return this;
            }

            public Builder setEmailAddress(String emailAddress) {
                studentToBuild.setEmailAddress(emailAddress);
                return this;
            }

            public Builder setHasSocialBenefit(boolean socialBenefit) {
                studentToBuild.setHasSocialBenefit(socialBenefit);
                return this;
            }

            public Builder setPostIndex(int postIndex) {
                studentToBuild.setPostIndex(postIndex);
                return this;
            }

            public Builder setFullTimeEducation(boolean fullTimeEducation) {
                studentToBuild.setFullTimeEducation(fullTimeEducation);
                return this;
            }

            public Builder setIsEmployee(boolean isEmployee) {
                studentToBuild.setIsEmployee(isEmployee);
                return this;
            }

            public Builder setMotherPhone(String motherPhone) {
                studentToBuild.setMotherPhone(motherPhone);
                return this;
            }

            public Builder setFatherPhone(String fatherPhone) {
                studentToBuild.setFatherPhone(fatherPhone);
                return this;
            }

            public Builder setIsScientificWorks(boolean isScientificWorks) {
                studentToBuild.setIsScientificWorks(isScientificWorks);
                return this;
            }

            public Student build(){
                return studentToBuild;
            }

        }

    }

