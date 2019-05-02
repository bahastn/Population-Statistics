package entities;

import org.bson.Document;

import java.util.Objects;

public class Population {

    private String zipCode;
    private Integer totalPopulation;
    private Double medianAge;
    private Integer totalMales;
    private Integer getTotalFemales;
    private Integer totalHauseholds;
    private Double averageHauseholdSize;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getTotalPopulation() {
        return totalPopulation;
    }

    public void setTotalPopulation(Integer totalPopulation) {
        this.totalPopulation = totalPopulation;
    }

    public Double getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(Double medianAge) {
        this.medianAge = medianAge;
    }

    public Integer getTotalMales() {
        return totalMales;
    }

    public void setTotalMales(Integer totalMales) {
        this.totalMales = totalMales;
    }

    public Integer getGetTotalFemales() {
        return getTotalFemales;
    }

    public void setGetTotalFemales(Integer getTotalFemales) {
        this.getTotalFemales = getTotalFemales;
    }

    public Integer getTotalHauseholds() {
        return totalHauseholds;
    }

    public void setTotalHauseholds(Integer totalHauseholds) {
        this.totalHauseholds = totalHauseholds;
    }

    public Double getAverageHauseholdSize() {
        return averageHauseholdSize;
    }

    public void setAverageHauseholdSize(Double averageHauseholdSize) {
        this.averageHauseholdSize = averageHauseholdSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Population that = (Population) o;
        return Objects.equals(getZipCode(), that.getZipCode()) &&
                Objects.equals(getTotalPopulation(), that.getTotalPopulation()) &&
                Objects.equals(getMedianAge(), that.getMedianAge()) &&
                Objects.equals(getTotalMales(), that.getTotalMales()) &&
                Objects.equals(getGetTotalFemales(), that.getGetTotalFemales()) &&
                Objects.equals(getTotalHauseholds(), that.getTotalHauseholds()) &&
                Objects.equals(getAverageHauseholdSize(), that.getAverageHauseholdSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getZipCode(), getTotalPopulation(), getMedianAge(), getTotalMales(), getGetTotalFemales(), getTotalHauseholds(), getAverageHauseholdSize());
    }

    @Override
    public String toString() {
        return "Population{" +
                "zipCode='" + zipCode + '\'' +
                ", totalPopulation=" + totalPopulation +
                ", medianAge=" + medianAge +
                ", totalMales=" + totalMales +
                ", getTotalFemales=" + getTotalFemales +
                ", totalHauseholds=" + totalHauseholds +
                ", averageHauseholdSize=" + averageHauseholdSize +
                '}';
    }
    public  Document toDocument(){
        return new Document("Zip Code", this.getZipCode())
                .append("Total Population", this.getTotalPopulation());
    }
}
// sample data BSON
//    Zip Code:"91371"
//        Total Population:"1"
//        Median Age:"73.5"
//        Total Males:"0"
//        Total Females:"1"
//        Total Households:"1"
//        Average Household Size:"1