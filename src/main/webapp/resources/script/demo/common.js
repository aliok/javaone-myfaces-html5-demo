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

function removeCDataAndTrim(){
    var elementsByClassName = document.getElementsByClassName('prettyprint');
    var ua = navigator.userAgent;
    var isOpera = parseFloat(ua.split('Opera/')[1]) || undefined;
    for (var i=0; i<elementsByClassName.length; i++) {
        var innerHTML = elementsByClassName[i].innerHTML;
        if(isOpera)     //behaves different in Opera
            innerHTML = innerHTML.substr(10, innerHTML.length - 16);
        else
            innerHTML = innerHTML.substr(11, innerHTML.length - 16);
        innerHTML = innerHTML.replace(new RegExp("^[\\s]+", "g"), "");
        innerHTML = innerHTML.replace(new RegExp("[\\s]+$", "g"), "");
        elementsByClassName[i].innerHTML = innerHTML;
    }
}