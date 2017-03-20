/**
 * Created by zhiqiang_wang on 2016/04/04.
 */
function util_set_select_options($ctrl_select, option_value_array){

    $ctrl_select.empty();
    option_value_array.forEach(function (value) {
        var $option = $("<option></option>")
            .val(value)
            .text(value);
        $ctrl_select.append($option);

    });
}