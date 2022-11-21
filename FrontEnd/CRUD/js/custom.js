// Hiện cửa sổ nhập thông tin
$("#btnCreate").click(function () {
    $("#my-name").val("");
    $("#info-popup").show();
});

// Đóng cửa số Nhập thông tin
$("#close").click(function () {
    $("#info-popup").hide();
    $("#my-name").val("");
    $("#user-id").val("");
});

$("#btn-cancel").click(function () {
    $("#info-popup").hide();
    $("#my-name").val("");
    $("#user-id").val("");
});

getUsers();


// Get User
function getUsers() {
    $.ajax({
        type: "Get",
        url: "https://637794830992902a250c1fd1.mockapi.io/api/v1/users",
        data: "user",
        success: function (result) {
            result.forEach(element => {
                $("tbody").append(
                    '<tr>' +
                    '<td>' + element.id + '</td>' +
                    '<td>' + element.name + '</td>' +

                    '<td> <a href="#" style="margin-right: 30px;" onclick="deleteUserById(' + element.id + ');return false;">Xoá</a> <a href="#" onclick="updateUserById(' + element.id + ');return false;">Sửa</a>  </td>' +

                    '</tr>'
                );
            });
        }
    });
    return false;
}

// function createUser() {
//     var myName = $("#my-name").val();
//     var user = {
//         name: myName
//     }
//     $.ajax({
//         url: "https://637794830992902a250c1fd1.mockapi.io/api/v1/users",
//         type: "POST",
//         data: user,
//         success: function (result) {
//             console.log("thêm thành công!");

//             //xóa trắng danh sách trước khi tải lại
//             $('tbody').empty();


//             //tải lại danh sách user
//             getUsers();
//         }
//     });
// }


function deleteUserById(id) {
    $.ajax({
        type: "DELETE",
        url: "https://637794830992902a250c1fd1.mockapi.io/api/v1/users/" + id,
        data: "user",
        success: function (result) {
            console.log("Xoá Thành công");
            $("tbody").empty();
            getUsers();
        }
    });
    return false;
}

function saveUser() {
    var myName = $("#my-name").val();
    var userId = $("#user-id").val();

    var user = {
        name: myName
    }

    if (userId !== undefined && userId !== "") {
        //Sửa
        $.ajax({
            type: "PUT",
            url: "https://637794830992902a250c1fd1.mockapi.io/api/v1/users/" + userId,
            data: user,
            success: function (result) {
                console.log("Cập nhập Thành công");
                $("tbody").empty();
                $("#info-popup").hide();
                $("#my-name").val("");
                $("#user-id").val("");
                getUsers();
            }
        });
    } else {
        // Thêm mới
        $.ajax({
            url: "https://637794830992902a250c1fd1.mockapi.io/api/v1/users",
            type: "POST",
            data: user,
            success: function (result) {
                console.log("thêm thành công!");

                //xóa trắng danh sách trước khi tải lại
                $('tbody').empty();

                //ẩn cửa sổ nhập thông tin 
                $("#info-popup").hide();

                $("#my-name").val("");

                //tải lại danh sách user
                getUsers();
            }
        });
    }
}

function updateUserById(id) {
    $.ajax({
        type: "Get",
        url: "https://637794830992902a250c1fd1.mockapi.io/api/v1/users/"+ id,
        data: "user",
        success: function (result) {
            console.log(result);
            $("#info-popup").show();
            $("#my-name").val(result.name);
            $("#user-id").val(result.id);
        }
    });

}