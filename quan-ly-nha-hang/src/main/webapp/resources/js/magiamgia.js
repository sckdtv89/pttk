function getval(pgg) {
    const discount = pgg.value;
	if(discount !== 0){
		const giaCu = document.getElementById('tongTienThanhToan').value;
		const tongTienCu = giaCu.substring(0, giaCu.length-4);
		var giaMoi = tongTienCu - tongTienCu*discount/100;
		document.getElementById("tongTien").value = giaMoi + ' VND';
	}
}