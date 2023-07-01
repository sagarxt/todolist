function onRemove(id) {
  if (confirm("Do you want to remove ?")) {
    location.href = "/removetodo?id=" + id;
  }
}

function onCheckBoxClick(id, checkbox) {
  const isChecked = checkbox.checked;
  location.href = "/completetodo?id=" + id + "&isComplete=" + isChecked;
}
