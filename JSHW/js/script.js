const modal_open = document.getElementById("open");
const modal_cancel = document.getElementById("cancel");
const modal_container = document.getElementById("modal_container");
const addRandomArticle = document.getElementById("randomArticleGenerator");

modal_open.addEventListener("click", () => {
  modal_container.classList.add("show");
});

modal_cancel.addEventListener("click", () => {
  modal_container.classList.remove("show");
});

addRandomArticle.addEventListener("click", () => {
  const mussumIpsum = mIpsum({ pNum: 4 });

  let mainElement = document.querySelector("main");
  let articleElement = document.createElement("article");

  mainElement.appendChild(articleElement);

  articleElement.innerHTML =
    '<h1 class="title">The complete guide to explore Trasilvania, with your bike</h1>';
  articleElement.insertAdjacentHTML(
    "beforeend",
    '<ul class="post"><li class="datas">Destination Europe</li><li class="datas">Added by <span class="author">JonnathanMercadina</span></li><li class="datas">July 01, 2018</li></ul>'
  );
  articleElement.insertAdjacentHTML(
    "beforeend",
    '<div class="buttons-container"><button type="button" class="edit-delete">Edit</button><button type="button" class="edit-delete">Delete</button></div>'
  );

  let imgTemplate = `<img src='${"https://picsum.photos/1280/720"}'/>`;
  articleElement.insertAdjacentHTML("beforeend", imgTemplate);

  let textTemplate = `<div class="content-text"><p>${mussumIpsum}</p></div>`;
  articleElement.insertAdjacentHTML("beforeend", textTemplate);
});
