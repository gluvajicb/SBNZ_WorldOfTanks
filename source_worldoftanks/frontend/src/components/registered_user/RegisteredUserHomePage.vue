<template>
    
    <div id="homepage">
        <div id="headline">
            <b-card header-tag="header" border-variant="light" style="max-width: 50rem;" class="mb-2 mx-auto">
                <h4>Welcome to the World of Tanks - Tank Recommender!</h4>
            </b-card>
        </div>
        <div id="pageBody">
            <b-card header-tag="header" border-variant="light" style="max-width: 50rem;" class="mb-2 mx-auto">
                <div style="width: 500px;">
                    <div style="float: left; width: 200px;">
                        <h5>Ovde klikni za kec</h5>
                        <b-button variant="outline-primary" @click="funcOne">Button1</b-button><br><br>
                    </div>
                    <div style="float: left; width: 100px;">
                        <h5>Ovde klikni za dva</h5>
                        <b-button variant="outline-primary" @click="funcTwo">Button2</b-button><br><br>
                    </div>
                    <div style="float: left; width: 200px;">
                        <h5>Ovde klikni za tri</h5>
                        <b-button variant="outline-primary" @click="funcThree">Button3</b-button><br><br>
                    </div>
                    <br style="clear: left;" />
                </div>
            </b-card>
        </div>
    </div>
    
    
</template>

<style scoped>

#homepage{
    opacity: 0.9; 
    display: inline-block;
    padding: 1em;
    height: 5%;
    overflow: hidden;
  
}

#headline{
    position:absolute;
    top:60px;
    left: 20%;
    right: 20%;
}

#pageBody{
    position:absolute;
    top:150px;
    left: 10%;
    right: 10%;
}


</style>