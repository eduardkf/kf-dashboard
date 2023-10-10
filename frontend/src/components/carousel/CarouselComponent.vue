<template>
  <q-carousel
    v-model="activeSlide"
    horizontal
    transition-prev="slide-right"
    transition-next="slide-left"
    swipeable
    animated
    control-color="white"
    navigation-icon="radio_button_unchecked"
    navigation
    navigation-position="bottom"
    padding
    arrows
    height="300px"
    style="min-height: 50vh"
    class="carousel-style bg-transparent text-white shadow-1 rounded-borders"
  >
    <q-carousel-slide
      v-for="(slide, index) in slides"
      :key="index"
      :name="index"
      style="min-height: 10vh"
      class="column no-wrap flex-center"
    >
      <h4
        class="q-mb-xl text-weight-light text-center"
        style="font-size: 1.7rem; color: white"
      >
        {{ slide.title }}
      </h4>
      <q-img
        :src="slide.imageSrc"
        alt="Image"
        style="max-width: 50vw; min-height: 10vw"
      />
    </q-carousel-slide>
  </q-carousel>
</template>
<script setup lang="ts">
import { ref, toRef } from 'vue';
import CareouselSlideComponent from './CareouselSlideComponent.vue';

const props = defineProps({
  slides: {
    type: Array,
    required: true,
  },
});

const activeSlide = ref(0);
</script>

<style scopded>
</style>
