

const images = document.getElementsByClassName("previewImage");

images.forEach(previewImage =>{
    previewImage.addEventListener('click', function handleClick(event){
        console.log('Box Clicked ', event)
    });
});