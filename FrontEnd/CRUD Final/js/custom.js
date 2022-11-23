
$(function () {
    $("#nav").load("templates/navigation.html");

});

$("#them").click(function () {
    $("#group-id").val("");
    $("#groupName").val("");
    $("#member").val("");
    $("#creator").val("");
    $("#crateDate").val("");
    $("#myModal").toggle();
});
$("#huy").click(function () {
    $("#group-id").val("");
    $("#groupName").val("");
    $("#member").val("");
    $("#creator").val("");
    $("#crateDate").val("");

    $("#myModal").hide();
});
$("#close").click(function () {
    $("#group-id").val("");
    $("#groupName").val("");
    $("#member").val("");
    $("#creator").val("");
    $("#crateDate").val("");

    $("#myModal").hide();
});




getGroupList();

// CRUD

// Lấy thông tin Group từ mockapi
// https://637c3ec972f3ce38ea9ddfa7.mockapi.io/api/Group

function getGroupList() {
    $.ajax({
        type: "GET",
        url: "https://637c3ec972f3ce38ea9ddfa7.mockapi.io/api/Group",
        data: "Group",
        success: function (result) {
            result.forEach(element => {
                $("tbody").append(
                    '<tr>' +
                    '<td>' + element.id + '</td>' +
                    '<td>' + element.GroupName + '</td>' +
                    '<td>' + element.Member + '</td>' +
                    '<td>' + element.Creator + '</td>' +
                    '<td>' + element.CreateDate + '</td>' +
                    '<td> <a href="#" style="margin-right: 30px;" onclick="deleteGroupById(' + element.id + ');return false;">Xoá</a> <a href="#" onclick="updateGroupById(' + element.id + ');return false;">Sửa</a>  </td>' +
                    '</tr>'
                );
            });
        }

    });
    return false;
}

function deleteGroupById(id) {
    $.ajax({
        type: "DELETE",
        url: "https://637c3ec972f3ce38ea9ddfa7.mockapi.io/api/Group/" + id,
        data: "Group",
        success: function (result) {
            console.log("Xoá Thành công");
            $("tbody").empty();
            getGroupList();
        }
    });
    return false;
}

function updateGroupById(id) {
    $.ajax({
        type: "Get",
        url: "https://637c3ec972f3ce38ea9ddfa7.mockapi.io/api/Group/" + id,
        data: "user",
        success: function (result) {
            console.log(result);
            $("#myModal").show();

            $("#group-id").val(result.id);
            $("#groupName").val(result.GroupName);
            $("#member").val(result.Member);
            $("#creator").val(result.Creator);
            $("#crateDate").val(result.CreateDate);
        }
    });
}


function saveGroup() {
    var groupId = $("#group-id").val();
    var groupName = $("#groupName").val();
    var groupMember = $("#member").val();
    var groupCreator = $("#creator").val();
    var groupCreateDate = $("#crateDate").val();

    var Group = {
        GroupName: groupName,
        Member: groupMember,
        Creator: groupCreator,
        CreateDate: groupCreateDate,
    }

    if (groupId !== undefined && groupId !== "") {
        //Sửa
        $.ajax({
            type: "PUT",
            url: "https://637c3ec972f3ce38ea9ddfa7.mockapi.io/api/Group/" + groupId,
            data: Group,
            success: function (result) {
                console.log("Cập nhập Thành công");
                $("tbody").empty();

                $("#myModal").hide();


                $("#group-id").val("");
                $("#groupName").val("");
                $("#member").val("");
                $("#creator").val("");
                $("#crateDate").val("");
                getGroupList();
            }
        });
    } else {
        // Thêm mới
        $.ajax({
            url: "https://637c3ec972f3ce38ea9ddfa7.mockapi.io/api/Group/",
            type: "POST",
            data: Group,
            success: function (result) {
                console.log("thêm thành công!");

                //xóa trắng danh sách trước khi tải lại
                $('tbody').empty();

                //ẩn cửa sổ nhập thông tin 
                $("#myModal").hide();

                $("#group-id").val("");
                $("#groupName").val("");
                $("#member").val("");
                $("#creator").val("");
                $("#crateDate").val("");

                //tải lại danh sách user
                getGroupList();
            }
        });
    }
}


