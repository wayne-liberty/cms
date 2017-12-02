package xmu.javaee.classmanager.coursems.vo.output;

import xmu.javaee.classmanager.coursems.vo.input.BindInputSchool;

/**
 * Demo TeacherInfoOutput
 *
 * @author drafting_dreams
 * @date 2017/12/02
 */
public class TeacherInfoOutput {
    private Integer id;
    private String type;
    private String name;
    private String number;
    private String phone;
    private String email;
    private String male;
    private BindInputSchool school;
    private String title;
    private String avatar;

    public TeacherInfoOutput() {}

    public TeacherInfoOutput(Integer id, String type, String name, String number, String phone, String email, String male, BindInputSchool school, String title, String avatar) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.number = number;
        this.phone = phone;
        this.email = email;
        this.male = male;
        this.school = school;
        this.title = title;
        this.avatar = avatar;

    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public BindInputSchool getSchool() {
        return school;
    }

    public void setSchool(BindInputSchool school) {
        this.school = school;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


}