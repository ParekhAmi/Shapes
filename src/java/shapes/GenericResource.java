/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * REST Web Service
 *
 * @author 1894192
 */
@Path("mad")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

     @GET
    @Path("shapesList")
    @Produces(MediaType.TEXT_PLAIN)
    public String shpaes() {

        JSONArray mainArray = new JSONArray();
        JSONObject singleObj = new JSONObject();
        
        singleObj.accumulate("name","Triangle");
        singleObj.accumulate("numOfParam",2);
        
        mainArray.add(singleObj);
        
        singleObj.clear();
        
         singleObj.accumulate("name","Square");
        singleObj.accumulate("numOfParam",1);
        
        mainArray.add(singleObj);
        
        singleObj.clear();
        singleObj.accumulate("name","Rectangle");
        singleObj.accumulate("numOfParam",2);
        
        mainArray.add(singleObj);
        
        singleObj.clear();
        singleObj.accumulate("name","Parallelogram");
        singleObj.accumulate("numOfParam",2);
        
        mainArray.add(singleObj);
        
        singleObj.clear();
        singleObj.accumulate("name","Trapezoid");
        singleObj.accumulate("numOfParam",3);
        
        mainArray.add(singleObj);
        singleObj.clear();
        
        singleObj.accumulate("name","Circle");
        singleObj.accumulate("numOfParam",1);
        
        mainArray.add(singleObj);
        singleObj.clear();
        
        singleObj.accumulate("name","Ellipse");
        singleObj.accumulate("numOfParam",2);
        
        mainArray.add(singleObj);
        singleObj.clear();
        
       
        singleObj.accumulate("name","Sector");
        singleObj.accumulate("numOfParam",2);
        
        mainArray.add(singleObj);
        
        singleObj.clear();
    
        return mainArray.toString();
    }
    
   
    
     @GET
    @Path("shape&{shapeName}&{value1}")
    @Produces(MediaType.TEXT_PLAIN)
    public String shapeOne(@PathParam("shapeName") String shapename,@PathParam("value1") double Val1) {

        JSONObject shapeOne = new JSONObject();
        
        if(shapename.equals("Circle")){
            shapeOne.accumulate("Status", "OK");
        shapeOne.accumulate("TimeStamp", System.currentTimeMillis()/1000);
        shapeOne.accumulate("Shape", shapename);
        shapeOne.accumulate("Radius", Val1);
        shapeOne.accumulate("Area",3.14159*Val1*Val1);
        } 
        else if(shapename.equals("Square")){
            shapeOne.accumulate("Status", "OK");
        shapeOne.accumulate("TimeStamp", System.currentTimeMillis()/1000);
        shapeOne.accumulate("Shape", shapename);
        shapeOne.accumulate("Radius", Val1);
        shapeOne.accumulate("Area",Val1*Val1);
        }
        else{
            shapeOne.accumulate("Status", "Error");
        shapeOne.accumulate("TimeStamp",System.currentTimeMillis()/1000);
        shapeOne.accumulate("Shape", shapename);
       shapeOne.accumulate("Message","not correct shape");
        }

 
        return shapeOne.toString();
        
    }
    
     @GET
    @Path("shape&{shapeName}&{value1}&{Value2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String shapeTwo(@PathParam("shapeName") String shapename,@PathParam("value1") double Val1,@PathParam("value2") double Val2) {

        JSONObject shapeTwo = new JSONObject();

        if(shapename.equals("Triangle")){
             shapeTwo.accumulate("Status", "OK");
        shapeTwo.accumulate("TimeStamp",System.currentTimeMillis()/1000 );
        shapeTwo.accumulate("Shape", shapename);
        shapeTwo.accumulate("Width", Val1);
        shapeTwo.accumulate("Height", Val2);
         shapeTwo.accumulate("Area", 1/2*Val1*Val2);
        }
        else if(shapename.equals("Rectangle")){
        
        shapeTwo.accumulate("Status", "OK");
        shapeTwo.accumulate("TimeStamp",System.currentTimeMillis()/1000 );
        shapeTwo.accumulate("Shape", shapename);
        shapeTwo.accumulate("Width", Val1);
        shapeTwo.accumulate("Height", Val2);
         shapeTwo.accumulate("Area", Val1*Val2);
        }else if(shapename.equals("Parallelogram")){
        
        shapeTwo.accumulate("Status", "OK");
        shapeTwo.accumulate("TimeStamp",System.currentTimeMillis()/1000 );
        shapeTwo.accumulate("Shape", shapename);
        shapeTwo.accumulate("Width", Val1);
        shapeTwo.accumulate("Height", Val2);
         shapeTwo.accumulate("Area", Val1*Val2);
        } else if(shapename.equals("Ellipse")){
        
        shapeTwo.accumulate("Status", "OK");
        shapeTwo.accumulate("TimeStamp",System.currentTimeMillis()/1000 );
        shapeTwo.accumulate("Shape", shapename);
        shapeTwo.accumulate("Width", Val1);
        shapeTwo.accumulate("Height", Val2);
         shapeTwo.accumulate("Area", 3.14*Val1*Val2);
        } else if(shapename.equals("Sector")){
        
        shapeTwo.accumulate("Status", "OK");
        shapeTwo.accumulate("TimeStamp",System.currentTimeMillis()/1000 );
        shapeTwo.accumulate("Shape", shapename);
        shapeTwo.accumulate("Width", Val1);
        shapeTwo.accumulate("Height", Val2);
         shapeTwo.accumulate("Area", 1/2*Val1*Val2*5);
        }  
    
         return shapeTwo.toString();
        
    }
    
    @GET
    @Path("shape&{shapeName}&{value1}&{value2}&{value3}")
    @Produces(MediaType.TEXT_PLAIN)
    public String Trapezoid(@PathParam("shapeName") String shapename,@PathParam("value1") double Val1, @PathParam("value2") double Val2,@PathParam("value3") double Val3) {

        JSONObject shapeObject = new JSONObject();
        
        if(shapename.equals("Trapezoid")){
            
        shapeObject.accumulate("Status", "OK");
        shapeObject.accumulate("TimeStamp",System.currentTimeMillis()/1000);
        shapeObject.accumulate("Shape", shapename);
        shapeObject.accumulate("Base1", Val1);
        shapeObject.accumulate("Base2", Val2);
        shapeObject.accumulate("Height", Val3);
       shapeObject.accumulate("Area", 1/2*(Val1+Val2)*Val3);
        }
        else{
        shapeObject.accumulate("Status", "Error");
        shapeObject.accumulate("TimeStamp",System.currentTimeMillis()/1000);
        shapeObject.accumulate("Shape", shapename);
       shapeObject.accumulate("Message","not correct shape");
        }
         
      
       return shapeObject.toString();

   }
  
}
