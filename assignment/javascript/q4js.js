 var obj1={
   	name: "yukti",
   	age: 20,
   	competency:"JVM"
   };

      function obj_print(object){
      for(var key in object)
      {
       console.log("Key= "+key+", value= "+object[key]);
      }};

    console.log("ENTERED OBJECT IS:-");

      obj_print(obj1);
      console.log(obj1);     

      console.log("*****************");
      console.log("COPIED OBJECT IS:-");
    
 function objectCopy()
 {    var obj_copied = Object.assign({}, obj1);
        obj_print(obj_copied);
      console.log(obj_copied);
 }
 