/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//delete method using AJAX to POST
$(document).ready(function() {
    var idDelete=null;
    $('#resultadoConsulta tr td a').on('click', 'span', function(e) {
        //e.preventDefault();
        var option = $(this).attr('class');

        if (option === "glyphicon glyphicon-trash") {
            idDelete = $(this).attr('id');
            $('#myModal').modal();
        }
    });

    $('#yesDelete').on('click', function(e) {
        //post delete method here
        $.ajax({
            type: "POST",
            url: "profesor/eliminarProfesor",
            data: {codigo: idDelete},
            success: location.reload()
        });
    });
});
