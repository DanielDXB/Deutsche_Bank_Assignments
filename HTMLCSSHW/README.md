# Daniel Bolontoc &copyright; 2022

# Project Overview

Implemented a responsive travelling blog page using HTML, CSS and JS.

# Technology used

    HTML, CSS, JS, Bootstrap 5 and css3buttongenerator

# Components / Styles

## Navigation Bar and Functional button (Responsive)

HTML

```
<!-- NavBar Header-->
    <header id="header">
      <nav>
        <input type="checkbox" id="check" />
        <label for="check" class="checkbtn">
          <i class="fa fa-bars"></i>
        </label>
        <ul>
          <li><a href="index.html">Travel Updates</a></li>
          <li><a href="index.html">Reviews</a></li>
          <li><a href="index.html">About</a></li>
          <li><a href="index.html">Contact</a></li>
        </ul>
      </nav>
    </header>
    <!-- NavBar Header-->

    <!-- AddArticle Btn -->
    <div class="addbtn">
      <button class="btn" type="button" id="open">
        <p>+ ADD ARTICLE</p>
      </button>
    </div>
    <!-- AddArticle Btn -->
```

CSS

```
nav {
  margin-top: 100px;
  height: 30px;
  width: 100%;
}

nav ul {
  float: right;
}
nav ul li {
  display: inline-block;
  line-height: 30px;
}
nav ul li a {
  color: #1e1e1e;
  font-size: 11px;
  text-transform: uppercase;
  text-decoration: none;
  margin-left: 100px;
}

a:hover {
  color: pink;
  transition: 0.2s;
}

.btn {
    width: 100%;
}
.checkbtn {
  font-size: 30px;
  color: #1e1e1e;
  float: right;
  line-height: 30px;
  margin-right: 40px;
  cursor: pointer;
  display: none;
}

.btn:hover {
    background-color: pink;
}

#check {
  display: none;
}

@media (max-width: 858px) {
  .checkbtn {
    display: block;
  }

  ul {
    position: fixed;
    width: 100%;
    height: 100vh;
    background: pink;
    top: 80px;
    left: -100%;
    text-align: center;
    transition: all 0.5s;
  }

  nav ul li {
    display: block;
    margin: 50px 0;
    line-height: 30px;
  }

  nav ul li a {
    font-size: 20px;
    margin: 0;
  }

  a:hover {
    color: #1e1e1e;
  }

  #check:checked ~ ul {
    left: 0;
  }
}

.addbtn {
    display : flex;
    justify-content: flex-end;
    margin: 130px 0 90px;
}

.btn {
  float: right;
  -webkit-border-radius: 50;
  -moz-border-radius: 50;
  border-radius: 50px;
  font-family: "Montserrat", sans-serif;
  color: #1e1e1e;
  font-size: 14px;
  width: 300px;
  height: 60px;
  border: solid #9b9b9b 1px;
  text-decoration: none;
}
```

## Main Content (Responsive)

HTML

```
    <!-- Content -->
    <main>
      <article>
        <!-- Article content  -->
        <h1 class="title">
          The complete guide to explore Trasilvania, with your bike
        </h1>
        <ul class="post">
          <li class="datas">Destination Europe</li>
          <li class="datas">
            Added by
            <span class="author">Jonnathan Mercadina</span>
          </li>
          <li class="datas">July 01, 2018</li>
        </ul>
        <div class="buttons-container">
          <button type="button" class="edit-delete">Edit</button>
          <button type="button" class="edit-delete">Delete</button>
        </div>
        <img src="./images/bike.jpg" alt="Bike Image" />
        <div class="content-text">
          <p>
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Eaque,
            consequuntur quisquam! Pariatur doloribus nulla ab laboriosam illo
            magni dignissimos earum officia nesciunt porro facere error non
            distinctio, exercitationem, rerum, cumque tempore quia tempora ad.
            Id sit et sunt incidunt iste cumque nisi distinctio, dolor, ex in
            pariatur sed labore ipsa. Placeat voluptatibus labore,
            necessitatibus ipsum cumque aut officia neque, vero, explicabo
            maxime vitae. Fugiat sunt nostrum voluptas et tenetur, iure numquam
            ad harum accusantium dicta mollitia voluptates commodi vero incidunt
            perspiciatis vel, assumenda quo animi sed natus ratione, enim iste
            recusandae cum. Iusto error sit explicabo pariatur quam nulla
            mollitia possimus minus maxime impedit, dolor ducimus ratione
            facere? Dignissimos dolorum distinctio velit! Quisquam officia
            nobis, sint repellat nulla cumque dolorum, perspiciatis error vel,
            in minus vero aliquam doloribus. Fugit, ipsa. Veniam provident magni
            suscipit porro enim delectus dolorem consequatur voluptatum quaerat
            excepturi, sint, totam earum possimus! Explicabo iure nobis corporis
            in commodi magnam. Culpa eveniet necessitatibus obcaecati aliquam
            voluptates, exercitationem libero architecto ea quam ullam
            repellendus beatae inventore eaque quasi numquam sed possimus earum
            iure modi iusto corporis? Ratione eaque amet cumque assumenda magni
            repellat, vitae enim quibusdam quas accusantium tempora, minus est
            voluptatibus, pariatur reprehenderit voluptates? Sunt architecto
            esse eum officia sint obcaecati laudantium eligendi suscipit
            voluptas doloremque, nihil itaque deserunt neque est nam unde nisi
            aliquid accusantium dignissimos iusto distinctio nemo provident
            quibusdam. Fuga repellendus eius odio? Velit veniam magni enim
            nobis, iure praesentium, vel harum, dolore qui porro ad optio
            accusantium suscipit animi tempora. At deserunt facilis, omnis ipsum
            ad cupiditate eos culpa voluptatibus! Accusantium, placeat libero.
            Illo quia maxime quidem labore tempora dolore, consectetur saepe
            modi nemo officia assumenda neque odit nisi corrupti dicta vitae
            veniam quo id at. Fugiat velit debitis possimus impedit dolores
            quibusdam rem excepturi, quos, ex itaque mollitia distinctio porro
            quidem omnis.
          </p>
        </div>
      </article>

      <article>
        <!-- Article content  -->
        <h1 class="title">Bucegi: Places you must visit before you die</h1>
        <ul class="post">
          <li class="datas">Must Visit</li>
          <li class="datas">Added by Jonnathan Mercadina</li>
          <li class="datas">June 30, 2018</li>
        </ul>
        <div class="buttons-container">
          <button type="button" class="edit-delete">Edit</button>
          <button type="button" class="edit-delete">Delete</button>
        </div>
        <img src="./images/bucegi.jpg" alt="Bike Image" />
        <div class="content-text">
          <p>
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Eaque,
            consequuntur quisquam! Pariatur doloribus nulla ab laboriosam illo
            magni dignissimos earum officia nesciunt porro facere error non
            distinctio, exercitationem, rerum, cumque tempore quia tempora ad.
            Id sit et sunt incidunt iste cumque nisi distinctio, dolor, ex in
            pariatur sed labore ipsa. Placeat voluptatibus labore,
            necessitatibus ipsum cumque aut officia neque, vero, explicabo
            maxime vitae. Fugiat sunt nostrum voluptas et tenetur, iure numquam
            ad harum accusantium dicta mollitia voluptates commodi vero incidunt
            perspiciatis vel, assumenda quo animi sed natus ratione, enim iste
            recusandae cum. Iusto error sit explicabo pariatur quam nulla
            mollitia possimus minus maxime impedit, dolor ducimus ratione
            facere? Dignissimos dolorum distinctio velit! Quisquam officia
            nobis, sint repellat nulla cumque dolorum, perspiciatis error vel,
            in minus vero aliquam doloribus. Fugit, ipsa. Veniam provident magni
            suscipit porro enim delectus dolorem consequatur voluptatum quaerat
            excepturi, sint, totam earum possimus! Explicabo iure nobis corporis
            in commodi magnam. Culpa eveniet necessitatibus obcaecati aliquam
            voluptates, exercitationem libero architecto ea quam ullam
            repellendus beatae inventore eaque quasi numquam sed possimus earum
            iure modi iusto corporis? Ratione eaque amet cumque assumenda magni
            repellat, vitae enim quibusdam quas accusantium tempora, minus est
            voluptatibus, pariatur reprehenderit voluptates? Sunt architecto
            esse eum officia sint obcaecati laudantium eligendi suscipit
            voluptas doloremque, nihil itaque deserunt neque est nam unde nisi
            aliquid accusantium dignissimos iusto distinctio nemo provident
            quibusdam. Fuga repellendus eius odio? Velit veniam magni enim
            nobis, iure praesentium, vel harum, dolore qui porro ad optio
            accusantium suscipit animi tempora. At deserunt facilis, omnis ipsum
            ad cupiditate eos culpa voluptatibus! Accusantium, placeat libero.
            Illo quia maxime quidem labore tempora dolore, consectetur saepe
            modi nemo officia assumenda neque odit nisi corrupti dicta vitae
            veniam quo id at. Fugiat velit debitis possimus impedit dolores
            quibusdam rem excepturi, quos, ex itaque mollitia distinctio porro
            quidem omnis.
          </p>
        </div>
      </article>

      <article>
        <!-- Article content  -->
        <h1 class="title">Romania: The land of dreams</h1>
        <ul class="post">
          <li class="datas">Village</li>
          <li class="datas">
            Added by
            <span class="author">Jonnathan Mercadina</span>
          </li>
          <li class="datas">June 17, 2018</li>
        </ul>
        <div class="buttons-container">
          <button type="button" class="edit-delete">Edit</button>
          <button type="button" class="edit-delete">Delete</button>
        </div>
        <img src="./images/village.jpg" alt="Bike Image" />
        <div class="content-text">
          <p>
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Eaque,
            consequuntur quisquam! Pariatur doloribus nulla ab laboriosam illo
            magni dignissimos earum officia nesciunt porro facere error non
            distinctio, exercitationem, rerum, cumque tempore quia tempora ad.
            Id sit et sunt incidunt iste cumque nisi distinctio, dolor, ex in
            pariatur sed labore ipsa. Placeat voluptatibus labore,
            necessitatibus ipsum cumque aut officia neque, vero, explicabo
            maxime vitae. Fugiat sunt nostrum voluptas et tenetur, iure numquam
            ad harum accusantium dicta mollitia voluptates commodi vero incidunt
            perspiciatis vel, assumenda quo animi sed natus ratione, enim iste
            recusandae cum. Iusto error sit explicabo pariatur quam nulla
            mollitia possimus minus maxime impedit, dolor ducimus ratione
            facere? Dignissimos dolorum distinctio velit! Quisquam officia
            nobis, sint repellat nulla cumque dolorum, perspiciatis error vel,
            in minus vero aliquam doloribus. Fugit, ipsa. Veniam provident magni
            suscipit porro enim delectus dolorem consequatur voluptatum quaerat
            excepturi, sint, totam earum possimus! Explicabo iure nobis corporis
            in commodi magnam. Culpa eveniet necessitatibus obcaecati aliquam
            voluptates, exercitationem libero architecto ea quam ullam
            repellendus beatae inventore eaque quasi numquam sed possimus earum
            iure modi iusto corporis? Ratione eaque amet cumque assumenda magni
            repellat, vitae enim quibusdam quas accusantium tempora, minus est
            voluptatibus, pariatur reprehenderit voluptates? Sunt architecto
            esse eum officia sint obcaecati laudantium eligendi suscipit
            voluptas doloremque, nihil itaque deserunt neque est nam unde nisi
            aliquid accusantium dignissimos iusto distinctio nemo provident
            quibusdam. Fuga repellendus eius odio? Velit veniam magni enim
            nobis, iure praesentium, vel harum, dolore qui porro ad optio
            accusantium suscipit animi tempora. At deserunt facilis, omnis ipsum
            ad cupiditate eos culpa voluptatibus! Accusantium, placeat libero.
            Illo quia maxime quidem labore tempora dolore, consectetur saepe
            modi nemo officia assumenda neque odit nisi corrupti dicta vitae
            veniam quo id at. Fugiat velit debitis possimus impedit dolores
            quibusdam rem excepturi, quos, ex itaque mollitia distinctio porro
            quidem omnis.
          </p>
        </div>
      </article>

      <article>
        <!-- Article content  -->
        <h1 class="title">Sarmale - stuffed cabbage rolls Good or bad?</h1>
        <ul class="post">
          <li class="datas">Food</li>
          <li class="datas">
            Added by
            <span class="author">Jonnathan Mercadina</span>
          </li>
          <li class="datas">December 29, 2017</li>
        </ul>
        <div class="buttons-container">
          <button type="button" class="edit-delete">Edit</button>
          <button type="button" class="edit-delete">Delete</button>
        </div>
        <img src="./images/sarmale.jpg" alt="Bike Image" />
        <div class="content-text">
          <p>
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Eaque,
            consequuntur quisquam! Pariatur doloribus nulla ab laboriosam illo
            magni dignissimos earum officia nesciunt porro facere error non
            distinctio, exercitationem, rerum, cumque tempore quia tempora ad.
            Id sit et sunt incidunt iste cumque nisi distinctio, dolor, ex in
            pariatur sed labore ipsa. Placeat voluptatibus labore,
            necessitatibus ipsum cumque aut officia neque, vero, explicabo
            maxime vitae. Fugiat sunt nostrum voluptas et tenetur, iure numquam
            ad harum accusantium dicta mollitia voluptates commodi vero incidunt
            perspiciatis vel, assumenda quo animi sed natus ratione, enim iste
            recusandae cum. Iusto error sit explicabo pariatur quam nulla
            mollitia possimus minus maxime impedit, dolor ducimus ratione
            facere? Dignissimos dolorum distinctio velit! Quisquam officia
            nobis, sint repellat nulla cumque dolorum, perspiciatis error vel,
            in minus vero aliquam doloribus. Fugit, ipsa. Veniam provident magni
            suscipit porro enim delectus dolorem consequatur voluptatum quaerat
            excepturi, sint, totam earum possimus! Explicabo iure nobis corporis
            in commodi magnam. Culpa eveniet necessitatibus obcaecati aliquam
            voluptates, exercitationem libero architecto ea quam ullam
            repellendus beatae inventore eaque quasi numquam sed possimus earum
            iure modi iusto corporis? Ratione eaque amet cumque assumenda magni
            repellat, vitae enim quibusdam quas accusantium tempora, minus est
            voluptatibus, pariatur reprehenderit voluptates? Sunt architecto
            esse eum officia sint obcaecati laudantium eligendi suscipit
            voluptas doloremque, nihil itaque deserunt neque est nam unde nisi
            aliquid accusantium dignissimos iusto distinctio nemo provident
            quibusdam. Fuga repellendus eius odio? Velit veniam magni enim
            nobis, iure praesentium, vel harum, dolore qui porro ad optio
            accusantium suscipit animi tempora. At deserunt facilis, omnis ipsum
            ad cupiditate eos culpa voluptatibus! Accusantium, placeat libero.
            Illo quia maxime quidem labore tempora dolore, consectetur saepe
            modi nemo officia assumenda neque odit nisi corrupti dicta vitae
            veniam quo id at. Fugiat velit debitis possimus impedit dolores
            quibusdam rem excepturi, quos, ex itaque mollitia distinctio porro
            quidem omnis.
          </p>
        </div>
      </article>
    </main>
    <!-- Content -->
```

CSS

```
.title {
    display : flex;
    line-height: 1.2;
    font-family: 'Montserrat', sans-serif;
    font-size: 46px;
    margin: 0 auto;
    text-align: center;
    max-width: 800px;
}


.post {
    list-style-type: none;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    margin-top: 30px;
}

.datas {
    color: #9b9b9b;
    display: block;
    font-family: 'Montserrat', sans-serif;
    font-size: 14px;
    padding: 0;
}

.datas:not(:last-child):after {
    content: '\2022';
    font-weight: bold;
    padding: 0 20px;

}
.author {
    color: #1e1e1e;
    font-weight: bold;
}

.buttons-container {
    margin: 40px 0 20px 0;
    display: flex;
    justify-content: flex-end;
}

.edit-delete {
    padding: 0;
    background: none;
    border: none;
    font-family: 'Montserrat', sans-serif;
    font-size: 14px;
    line-height: 1.3;
    cursor: pointer;
}

.edit-delete:not(:last-child):after {
    content: '\007c';
    padding: 5px;
}

img {
    width: 100%;
}

.content-text {
    margin-top: 80px;
}

p {
    align-items: center;
    max-width: 780px;
    margin : auto;
}

article {
    margin-bottom : 100px;
}
```

## Footer (Responsive)

HTML

```
    <!-- Footer -->
    <footer class="footer">
      <a href="#" class="left">previous</a>
      <a href="#" class="right">next</a>
    </footer>
    <!-- Footer -->
```

CSS

```
.footer {
  display: flex;
  justify-content: space-between;
}

.footer a {
    margin: 35px, 0, 100px;
    margin-top: 130px;
    text-decoration: none;
    color: #1e1e1e;
    font-size: 34px;
}
```

## Modal Pop-up form (Responsive and Functional)

HTML

```
    <!-- Modal -->
    <div class="modal-container" id="modal_container">
      <div class="modal-form">
        <div class="modal-content">
          <h2 class="title">Add/Edit new article</h2>
          <div class="form">
            <input type="text" class="input" placeholder="Please enter title"/>
            <input type="text" class="input" placeholder="Please enter tag"/>
            <input type="text" class="input" placeholder="Please enter author"/>
            <input type="text" class="input" placeholder="Please enter date"/>
            <input type="text" class="input url" placeholder="Please enter image url"/>
          </div>
          <textarea class="textarea" name="content" cols="28" rows="7"placeholder="Please enter content">

          </textarea>
          <div class="modal-buttons">
            <button type="button" class="cancel-button" id="cancel">Cancel</button>
            <button type="button" class="save-button">Save</button>
          </div>
        </div>
      </div>
    </div>
    <!-- Modal -->
```

CSS

```
.modal-container{
  display: none;
}

.modal-container.show{
  display: flex;
  background: rgba(0, 0, 0, 0.5);
  position: fixed;
  z-index: 1;
  left:0;
  top:0;
  height: 100vh;
  width: 100vw;
  overflow: auto;
  align-items: center;
  justify-content: center;
}

.modal-form {
  width: 1000px;
  height: 750px;
  background: white;
  box-shadow: 0 0 26px 6px;
}

.modal-content {
  padding: 50px 75px;
  height : 750px;
}

.form {
  display: flex;
  justify-content: space-between;
  flex-wrap: wrap;
  margin-top: 50px;
}

.input {
  width: 400px;
  height: 35px;
  border: 1px solid #9b9b9b;
  border-radius: 5px;
  font-size: 18px;
  font-family: 'Cardo', serif;
  padding: 0 5px;
  margin-bottom: 25px;
}

.url {
  width : 100%;
}

.textarea {
  display: block;
  border: 1px solid #9b9b9b;
  border-radius: 5px;
  font-size: 18px;
  font-family: 'Cardo', serif;
  width: 100%;
  box-sizing: border-box;
}

.modal-buttons {
  display: flex;
  justify-content: space-between;
  margin-top: 50px;

}

.cancel-button {
  background: none;
  border: 1px solid #9b9b9b;
  border-radius: 50px;
  font-size: 14px;
  height: 60px;
  line-height: 1.3;
  width: 300px;
  text-transform: uppercase;
  cursor: pointer;
}

.save-button {
  background: #FFE3E3;
  border: 1px solid #9b9b9b;
  border-radius: 50px;
  font-size: 14px;
  height: 60px;
  line-height: 1.3;
  width: 300px;
  text-transform: uppercase;
  cursor: pointer;
}
```

JavaScript

```
const modal_open = document.getElementById('open')
const modal_cancel = document.getElementById('cancel')
const modal_container = document.getElementById('modal_container')

modal_open.addEventListener('click', () => {
    modal_container.classList.add('show');
});

modal_cancel.addEventListener('click', () => {
    modal_container.classList.remove('show');
});
```
