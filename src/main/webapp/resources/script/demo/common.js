/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

function submitForm(formId){
   var inSinglePageView = false;
   if(document.getElementById(formId))
        inSinglePageView = true;

   var form;
   if(inSinglePageView)
      form = document.getElementById(formId);
   else
      form = document.getElementById('slideView:' + formId);
    
   var formValid = form.checkValidity();
   if(formValid){
       return true;
   }
   else{
       var elems;
       if(inSinglePageView)
           elems = document.querySelectorAll('#' + formId + " :invalid");
       else
           elems = document.querySelectorAll('#slideView\\:' + formId + " :invalid");

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


function handleAjaxEvent(e){
   if(e.status == 'success'){
     alert('Request sent and respose recieved.');
     return false;
   }
   return true;
}

function handleAjaxError(e){
   if(e.status == 'serverError'){
     alert('An error occurred during Ajax request. If you are on Google App Engine, please refresh the page. Unfortunately the view is expired on Google App Engine too early.');
     return false;
   }
   return true;
}
