package assignment7_lesson8.prob3;

import java.util.ArrayList;
import java.util.List;

public class Marketing {
    private String employeename;
    private String productname;
    private double salesamount;

    public Marketing(String employeename, String productname, double salesamount) {
        this.employeename = employeename;
        this.productname = productname;
        this.salesamount = salesamount;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getSalesamount() {
        return salesamount;
    }

    public void setSalesamount(double salesamount) {
        this.salesamount = salesamount;
    }

    @Override
    public boolean equals(Object o) {
        if (null == o) return false;
        if (this == o) return true;
        if (o.getClass() != this.getClass()) return false;
        Marketing market = (Marketing) o;
        return (market.productname.equals(productname) && market.employeename.equals(employeename));

    }
    @Override
    public String toString() {
        return employeename + " " + productname + " " + salesamount;
    }

}
