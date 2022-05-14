const modal_open = document.getElementById("open");
const modal_cancel = document.getElementById("cancel");
const modal_container = document.getElementById("modal_container");
const addRandomArticle = document.getElementById("randomArticleGenerator");
let users;
let posts;
modal_open.addEventListener("click", () => {
  modal_container.classList.add("show");
});

modal_cancel.addEventListener("click", () => {
  modal_container.classList.remove("show");
});

fetch("https://jsonplaceholder.typicode.com/users")
  .then((response) => response.json())
  .then((data) => (users = data));

fetch("https://jsonplaceholder.typicode.com/posts")
  .then((response) => response.json())
  .then((data) => (posts = data));

addRandomArticle.addEventListener("click", () => {
  if (getOption() == "Random Author") {
    const mussumIpsum = mIpsum({ pNum: 4 });

    let mainElement = document.querySelector("main");
    let articleElement = document.createElement("article");

    mainElement.appendChild(articleElement);

    let userId = Math.floor(Math.random() * 10 + 1) - 1;
    let postTitleFromUserId;

    for (let p in posts) {
      if (posts[p].userId == userId) {
        let postId = Math.floor(
          Math.random() * (10 * userId - 10 * (userId - 1) + 1) +
            10 * (userId - 1)
        );
        postTitleFromUserId = posts[postId].title;
        break;
      }
    }

    let articleTemplate = `
  '<h1 class="title">${postTitleFromUserId}</h1><ul class="post"><li class="datas">Destination Europe</li><li class="datas">Added by <span class="author">${
      users[userId].name
    }</span></li><li class="datas">July 01, 2018</li></ul>
  <div class="buttons-container"><button type="button" class="edit-delete">Edit</button><button type="button" class="edit-delete">Delete</button></div>
  <img src="https://picsum.photos/${1280}/${720}?dummy=${Math.floor(
      Math.random() * 100000
    )}" class="hero-image" alt="Random image"/><div class="content-text"><p>${mussumIpsum}</p></div>'
  `;
    if (
      document.getElementById("container").querySelectorAll("article").length <
      3
    ) {
      articleElement.insertAdjacentHTML("beforeend", articleTemplate);
    } else {
      paginationThree();
      articleElement.insertAdjacentHTML("beforeend", articleTemplate);
    }
  } else {
    const mussumIpsum = mIpsum({ pNum: 4 });

    let mainElement = document.querySelector("main");
    let articleElement = document.createElement("article");
    mainElement.appendChild(articleElement);

    let userId;
    for (var u in users) {
      if (users[u].name == getOption()) {
        userId = users[u].id;
        break;
      }
    }

    let postTitleFromUserId;

    for (let p in posts) {
      if (posts[p].userId == userId) {
        let postId = Math.floor(
          Math.random() * (10 * userId - 10 * (userId - 1) + 1) +
            10 * (userId - 1)
        );
        postTitleFromUserId = posts[postId].title;
        break;
      }
    }

    let articleTemplate = `
  '<h1 class="title">${postTitleFromUserId}</h1><ul class="post"><li class="datas">Destination Europe</li><li class="datas">Added by <span class="author">${
      users[userId - 1].name
    }</span></li><li class="datas">July 01, 2018</li></ul>
  <div class="buttons-container"><button type="button" class="edit-delete">Edit</button><button type="button" class="edit-delete">Delete</button></div>
  <img src="https://picsum.photos/${1280}/${720}?dummy=${Math.floor(
      Math.random() * 100000
    )}" class="hero-image" alt="Random image"/><div class="content-text"><p>${mussumIpsum}</p></div>'
  `;
    if (
      document.getElementById("container").querySelectorAll("article").length <
      3
    ) {
      articleElement.insertAdjacentHTML("beforeend", articleTemplate);
    } else {
      paginationThree();
      articleElement.insertAdjacentHTML("beforeend", articleTemplate);
    }
  }
});

function getOption() {
  return document.getElementById("authorSelect").value;
}

function paginationThree() {
  document.getElementById("container").firstChild.remove();
}
