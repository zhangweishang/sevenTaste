(function(){
    var page = new Array();
    page["jumpPage1"] = "bs_index-content";
    page["jumpPage2"] = "bs_index-BusinessInformation";
    $(".function").click(function () {
        $.ajax({
            type: "GET",
            url: page[$(this).attr("id")],
            success: function (msg) {
                $("#mainContent").html(msg);
            }
        });
        $(this).parent().siblings().removeClass("active");
        $(this).parent().addClass("active");
    });
})(jQuery);