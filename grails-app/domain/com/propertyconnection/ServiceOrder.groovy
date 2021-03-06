package com.propertyconnection

class ServiceOrder {

    String description
    Date dateCreated
    String location
    byte[] photo

    static belongsTo = [homes : Home]
    static  hasOne  = [landlord: Landlord, tenants: Tenant]



    static constraints = {
        landlord: true
        tenants: false
        description nullable: false
        dateCreated nullable: true
        location nullable: false
        photo nullable: true
    }
}
