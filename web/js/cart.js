
/**
 * 加入购物车
 */
function buy(goodid){
    $.post("goods_buy", {goodsid:goodid}, function(data){
        if(data=="ok")
        {
            layer.msg("添加到购物车!", {time:800}, function(){
                location.reload();
            });
        }
        else if(data=="fail")
        {
            layer.msg("库存不足,请购买其他商品!", {time:800}, function(){

            });
        }
    });
}

function reduce(goodsID){
    $.post("goods_reduce", {goodsID:goodsID}, function(data){
        if(data=="ok"){
            layer.msg("您减少成功!", {time:800}, function(){
                location.reload();
            });
        }
    });
}
/**
 * 购物车删除
 */
function deletes(goodid){
    $.post("goods_delete", {goodsid:goodid}, function(data){
        if(data=="ok"){
            layer.msg("删除成功!", {time:800}, function(){
                location.reload();
            });
        }
    });
}