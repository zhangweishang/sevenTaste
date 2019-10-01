<!-- Content Header (Page header) -->
<section class="content-header">
    <h1 id="title">
        商铺信息
        <small>商铺信息详情</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="javascript:void(0);"><i class="fa fa-dashboard"></i>首页</a></li>
        <li class="active" id="">商铺信息</li>
    </ol>
</section>


<!-- Main content -->
<section class="content">
    <div class="row">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">商铺数据表</h3>
                </div>
                <!-- /.box-header -->
                <div class="box-body">
                    <table id="example" class="display" style="width:100%;TABLE-LAYOUT:fixed;WORD-BREAK:break-all">
                        <thead>
                        <tr>
                            <th>商铺名称</th>
                            <th>商铺图标</th>
                            <th>商铺电话</th>
                            <th>商铺公告</th>
                            <th>商铺好评率</th>
                            <th>商铺状态</th>
                            <th>修改详情</th>
                        </tr>
                        </thead>
                        <tfoot>
                        </tfoot>
                    </table>
                </div>
                <!-- /.box-body -->
            </div>
            <!-- /.box -->
        </div>
        <!-- /.col -->
    </div>
    <!-- /.row -->
</section>
<!-- /.content -->
<script>
    $('#example').DataTable( {
        language: {"url":"json/lang.json"},
        aLengthMenu: [15, 25, 50, 100], // 更改显示记录数选项
        pagingType: "full_numbers",   // 分页样式：simple,simple_numbers,full,full_numbers
        columnDefs: [{
            "targets": 'nosort',        // 列的样式名
            "orderable": false          // 包含上样式名‘nosort'的禁止排序
        }],
        ajax: {
            type: "GET",
            url: "",
            dataType: "json",
            dataSrc: function(data){
                return data;
            }
        },
        columns: [
            {"data": "store_name" },
            {"data": "store_icon" },
            {"data": "store_phone" },
            {"data": "store_notice",
                "render": function(data) {
                    if(data.length>14){
                        return data.substr(0, 14) + "<span onclick='showAll(this.title)' title='"+data+"' style='color: blue'>"+ " ...更多</span>";
                    }else{
                        return data;
                    }
                }
            },
            {"data": "store_status" },
            {"data": null,
                "render": function(data) {
                    return "<span id='" + data.id + "' onclick='upladeStoreInfo(this.id)' style='color: blue'>"+ "修改</span>";
                }
            }
        ]
    });

    function showAll(title){
        alert(title);
    }

    function upladeStoreInfo(id){

    }

    // 取消掉 DataTables 弹出的错误提示
    $.fn.dataTable.ext.errMode = function (s, h, m) {}

</script>

