function submitForm(formId){
   var form = document.getElementById(formId);
   var formValid = form.checkValidity();
   if(formValid){
       return true;
   }
   else{
       var elems = document.querySelectorAll('#' + formId + " :invalid");
       if(elems && elems.length>0){
         elems[0].focus();
       }
   
       return false;
   }
}