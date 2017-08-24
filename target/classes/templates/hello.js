/*
/!**
 * Created by Oops on 12/8/2016.
 *!/
$(document).ready(function() {
/!*
    $.ajax({
        url: "http://rest-service.guides.spring.io/greeting"
    }).then(function(data) {
        $('.greeting-id').append(data.id);
        $('.greeting-content').append(data.content);
    });
*!/

    $(".ap").click(function () {
        alert("dfdfdf");
    })
});



<script>
$(document).ready(function () {
    setTimeout(function () {
        loadajax();
    }, 1000); // milliseconds
});

/!*      function loadajax() {
 $.ajax({
 url: "http://localhost:9000/restapi/students"
 }).then(function (data) {

 $.each(data, function (key, value) {
 $(".container ").append(key + " " + value.id + " " + value.roll + " " + value.firstName + " " + value.lastName + " " + value.address.street + " " + value.address.city + " " + value.address.zipCode + " " + value.address.state + "<br/>");
 });


 });
 }*!/


function loadajax() {
    $.ajax({
        url: "http://localhost:9000/restapi/students/3"
    }).then(function (data) {

        $(".container").append(data.id +" "+data.roll +" "+data.firstName +" "+data.lastName);
    });
}




*/
