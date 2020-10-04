
$(function () {
    let book_info = new Vue({
        el: "#div",//id
        data: {
            book: null
        },
        beforeCreate: function () {
            let url = '/getBooks';
            $.get(url, function (res) {
                //console.log(res)
                book_info.book = res
            }, 'json')
        }
    });

})


function change() {
    $("#FirstPage").load("centerPage.html");
}
