const modal_open = document.getElementById("open");
const modal_cancel = document.getElementById("cancel");
const modal_container = document.getElementById("modal_container");

modal_open.addEventListener("click", () => {
  modal_container.classList.add("show");
});

modal_cancel.addEventListener("click", () => {
  modal_container.classList.remove("show");
});
