package com.redhat.bpms.demo.fsi.onboarding.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RequiredDocuments implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Required Documents")
   private java.util.List<java.lang.String> requiredDocs = new java.util.ArrayList<>();

   public RequiredDocuments()
   {
   }

   public java.util.List<java.lang.String> getRequiredDocs()
   {
      return this.requiredDocs;
   }

   public void setRequiredDocs(java.util.List<java.lang.String> requiredDocs)
   {
      this.requiredDocs = requiredDocs;
   }

   public RequiredDocuments(java.util.List<java.lang.String> requiredDocs)
   {
      this.requiredDocs = requiredDocs;
   }
   
   public void addRequiredDocument(String requiredDoc) {
       requiredDocs.add(requiredDoc);
   }

}