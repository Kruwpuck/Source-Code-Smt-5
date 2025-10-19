function main() {
    // Your code here
    console.log("Hello, World!");   
}
function test() {
    alert("Test function executed");
}
function test2(x,y){
    return x*y;
}
function ambilTitle() {
    //var judul = document.getElementById("judul").innerHTML;
    var judul = $("#judul").html(); // bikin class dolar
    alert(judul);
}
function ubahTitle() {
    // var x = document.getElementById("teks").value;
    var x = $("#teks").val();
    $("#judul").html(x);
}