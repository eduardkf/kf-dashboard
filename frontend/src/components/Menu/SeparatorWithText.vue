<template>
  <div class="row fit no-wrap q-gutter-x-sm justify-start items-center">
    <q-separator class="col" />
    <div style="color: #514d598a" class="col-grow">
      {{ props.text }}
    </div>
    <q-separator inset class="col" />
  </div>
</template>
<script setup lang="ts">
import { ref, defineProps } from 'vue';

const props = defineProps({
  text: String,
});
</script>
