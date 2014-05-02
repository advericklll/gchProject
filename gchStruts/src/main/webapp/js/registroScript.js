/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    $("#fechaNacimiento").datepicker({
        changeMonth: true,
        changeYear: true
    });

    if ($("#sexo1").val() === '1') {
        $('#masculino').prop('checked', true);
        $('#femenino').prop('checked', false);
    } else {
        $('#masculino').prop('checked', false);
        $('#femenino').prop('checked', true);
    }

    //cambiar estado civil
    if ($("#civil").val() < '1') {
        $("#estadoCivil").val('-1');
    } else {
        $("#estadoCivil").val($("#civil").val());
    }

    $("#masculino").change(function() {
        $("#sexo1").val('1');
    });

    $("#femenino").change(function() {
        $("#sexo1").val('2');
    });

    $("#estadoCivil").change(function() {
        $("#civil").val($("#estadoCivil").val());
    });
});

