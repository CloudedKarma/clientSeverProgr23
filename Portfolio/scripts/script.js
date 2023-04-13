/*
    Student name: Silvia Preston
    File name: script.js
    Date: 04/10/2023
*/

//Hamburger menu function
function hamburger(){
    var menu = document.getElementById("menu-links");
    var logo = document.getElementById("ffc-logo");
    //if the display style of the menu is block AND
    //the logo disply style is none
    if(menu.style.display === "block" && logo.style.display === "none"){
        //if both statements are true
        menu.style.display = "none";
        logo.style.display = "block";
    }
    else{
        //if one of the statements or both is false
        menu.style.display = "block";
        logo.style.display = "none";
    }
  }