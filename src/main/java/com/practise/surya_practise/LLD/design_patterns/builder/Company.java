package com.practise.surya_practise.LLD.design_patterns.builder;

public class Company
{
    private String name;
    private String industry;
    private String address;
    private String phoneNumber;
    private String valueProposition;
    private String website;


    public static class CompanyBuilder
    {
        private String name;
        private String industry;
        private String address;
        private String phoneNumber;
        private String valueProposition;
        private String website;

        public CompanyBuilder address(String address){
            this.address=address;
            return this;
        }
        public CompanyBuilder phoneNumber(String phoneNumber){
            this.phoneNumber=phoneNumber;
            return this;
        }
        public CompanyBuilder valueProposition(String valueProposition){
            this.valueProposition=valueProposition;
            return this;
        }
        public CompanyBuilder website(String website){
            this.website=website;
            return this;
        }
        public Company build()
        {
            Company company= new Company();
            company.name=this.name;
            company.industry=this.industry;
            company.address=this.address;
            company.phoneNumber=this.phoneNumber;
            company.valueProposition=this.valueProposition;
            company.website=this.website;
            return company;
        }
    }
    public static CompanyBuilder builder(String name, String industry){
        CompanyBuilder companyBuilder= new CompanyBuilder();
        companyBuilder.name=name;
        companyBuilder.industry=industry;
        return companyBuilder;
    }

    public String toString(){
        return
                "{\nname="+name+"\n"+
                        "industry="+industry+"\n"+
                        "address="+address+"\n"+
                        "phoneNumber="+phoneNumber+"\n"+
                        "valueProposition="+valueProposition+"\n"+
                        "website="+website
                        +"\n}"
                ;
    }
}
