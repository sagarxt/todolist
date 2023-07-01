function onRemove(id) {
  if(confirm('Do you want to remove ?')){
    location.href='/removetodo?id='+id ;
  }
}

function onCheckBoxClick(id, checkbox){
  // const todoCompleteCheckBox = document.getElementById("todoComoplete");
  // console.log(checkbox.checked, id);
  const isChecked = checkbox.checked;
  location.href='/completetodo?id='+id+'&isComplete='+isChecked ;
}